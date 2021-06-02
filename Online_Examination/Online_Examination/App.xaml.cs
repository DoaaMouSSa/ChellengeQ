using System;
using TestInfo.Views;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace Online_Examination
{
    public partial class App : Application
    {
        public App()
        {
            InitializeComponent();
            //MainPage = new CrudPage();
            MainPage = new NavigationPage(new HomePage())
            {
                BarBackgroundColor = Color.FromRgb(26, 132, 148)
            };
            //MainPage =new NavigationPage( new MainPage());
            //MainPage = new HistoryTest();
        }

        protected override void OnStart()
        {
        }

        protected override void OnSleep()
        {
        }

        protected override void OnResume()
        {
        }
    }
}
