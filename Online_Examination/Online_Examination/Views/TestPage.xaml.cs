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
    public partial class TestPage : ContentPage
    {
        static int i = 0;
        static int result = 0;
        static string TypeOfExam = "";
        static IDictionary<string, string> CorrectionForAnswers = new Dictionary<string, string>();

        List<Question> lst;
        public TestPage(string TypeExam)
        {
            InitializeComponent();
            TestsCrud op = new TestsCrud();
            lst = op.allQHistory(TypeExam);
            lblQ.Text = lst[i].qustion;
            rd1.Text = lst[i].answer_a;
            rd2.Text = lst[i].answer_b;
            rd3.Text = lst[i].answer_c;
            rd4.Text = lst[i].answer_d;
            lblNum.Text += " : " + (i + 1);
            TypeOfExam = TypeExam;
            lblHeader.Text += TypeExam;
        }
        private bool CheckAnswer(string useranswer)
        {
            if (useranswer == lst[i].correct_answer) return true;
            else return false;
        }
        /*
        public HistoryTest(int id)
        {
            InitializeComponent();
            q = con.Find(id);
            loadData();
    }
    public void loadData()
    {
        ID = q.id;
        lblQ.Text = q.qustion;
        rd1.Text = q.answer_a;
        rd2.Text = q.answer_b;
        rd3.Text = q.answer_c;
        rd4.Text = q.answer_d;
        lblTest.Text = ID.ToString();
    }*/


        private void btnNext_Clicked(object sender, EventArgs e)
        {
            // ID += 1;
            string userAnswer = "";

            foreach (var item in stackRdo.Children)
            {
                if (item is RadioButton)
                {
                    RadioButton rdo = (RadioButton)item;
                    if (rdo.IsChecked == true)
                    {
                        userAnswer = rdo.Text;
                        break;
                    }
                }

            }
            if (CheckAnswer(userAnswer))
            {
                result++;
            }
            else
            {
                CorrectionForAnswers.Add(lst[i].qustion, lst[i].correct_answer);
            }
            if (i == (lst.Count() - 1))
            {
                //Navigation.PopAsync();
                Navigation.PushAsync(new ResultPage(result, CorrectionForAnswers));
                CorrectionForAnswers.Clear();
                TypeOfExam = "";
                i = 0;
                result = 0;
                lblHeader.Text = "";
            }
            else
            {
                i++;
                Navigation.PushAsync(new TestPage(TypeOfExam));
            }
        }
    }
}