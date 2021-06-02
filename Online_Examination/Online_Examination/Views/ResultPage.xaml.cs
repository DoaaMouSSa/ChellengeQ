using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.InteropServices.ComTypes;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace TestInfo.Views
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class ResultPage : ContentPage
    {
        public ResultPage(int result, IDictionary<string, string> CorrectionForAnswers)
        {
            InitializeComponent();
            lblTotal.Text =  result.ToString();
            if(CorrectionForAnswers.Count()>0)
            {
                lblCorrect.IsVisible = true;
                foreach (var item in CorrectionForAnswers)
                {
                    lblCorrectAns.Text += item.Key + "\n"+ item.Value + "\n";
                    
                }
            }
          
      
        }
        
        private void btnBack_Clicked(object sender, EventArgs e)
        {
            Navigation.PopAsync();
            Navigation.PushAsync(new HomePage());
        }

        private void btnShow_Clicked(object sender, EventArgs e)
        {

        }
    }
}
