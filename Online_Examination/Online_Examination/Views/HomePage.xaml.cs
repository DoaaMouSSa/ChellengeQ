using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace TestInfo.Views
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class HomePage : ContentPage
    {
        public HomePage()
        {
            InitializeComponent();
        }

        private void btnToHistoryPage_Clicked(object sender, EventArgs e)
        {
            Navigation.PushAsync(new TestPage(btnToHistoryPage.Text));
        }

        private void btnToGoePage_Clicked(object sender, EventArgs e)
        {
            Navigation.PushAsync(new TestPage(btnToGoePage.Text));

        }

 
        private void btnToSciensePage_Clicked(object sender, EventArgs e)
        {
            Navigation.PushAsync(new TestPage(btnToSciensePage.Text));
        }

        private void btnToSportPage_Clicked(object sender, EventArgs e)
        {
            Navigation.PushAsync(new TestPage(btnToSportPage.Text));

        }
    }
}