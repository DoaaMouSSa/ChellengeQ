using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TestInfo.DB;
using TestInfo.Models;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace TestInfo.Views
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class CrudPage : ContentPage
    {
        public CrudPage()
        {
            InitializeComponent();
            pickMaterial.ItemsSource=Enum.GetValues(typeof(Materials)).Cast<Materials>().Select(v => v.ToString())
            .ToList(); ;
        }


        string selectedItem = "";
        private void btnAdd_Clicked(object sender, EventArgs e)
        {
            QuestionsCrud con = new QuestionsCrud();
            Question q = new Question();
            q.qustion = txtQues.Text;
            q.answer_a = txtanswerA.Text;
            q.answer_b = txtanswerB.Text;
            q.answer_c = txtanswerC.Text;
            q.answer_d = txtanswerD.Text;
            q.Type = (Materials)Enum.Parse(typeof(Materials), selectedItem);
            //q.Type=(Materials)Enum.Parse(typeof(Materials),pickMaterial.Items[pickMaterial.SelectedIndex]);
            q.correct_answer = txtCorrect.Text;
            con.Create(q);
        }

        private void btndisplay_Clicked(object sender, EventArgs e)
        {
            QuestionsCrud con = new QuestionsCrud();
            foreach(var q in con.Read())
            {
                lblDisplay.Text += q.id;
                lblDisplay.Text += q.qustion;
               // lblDisplay.Text += q.correct_answer;
                //lblDisplay.Text += q.Type;

            }
        }

        private void btnDelete_Clicked(object sender, EventArgs e)
        {
            QuestionsCrud con = new QuestionsCrud();
            con.Delete(Convert.ToInt32(txtId.Text));
        }

        private void pickMaterial_SelectedIndexChanged(object sender, EventArgs e)
        {
            selectedItem = pickMaterial.SelectedItem.ToString();
            //DisplayAlert("", selectedItem, "ok");

        }
    }
}