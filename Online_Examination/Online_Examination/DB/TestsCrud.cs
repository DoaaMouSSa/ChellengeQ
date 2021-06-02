using SQLite;
using System;
using System.Collections.Generic;
using System.Text;
using TestInfo.Models;

namespace TestInfo.DB
{
    class TestsCrud
    {
        public  List<Question> allQHistory(string test)
        {
            Materials testy = (Materials)Enum.Parse(typeof(Materials), test, true);
            QuestionsCrud connect = new QuestionsCrud();
            var db = new SQLiteConnection(connect.pathDB);
            List<Question> AllQ = db.Table<Question>().Where(x=>x.Type== testy).ToList();
            return AllQ;
            /*Random rand = new Random();
            int toSkip = rand.Next(0, db.Table<Question>().ToList().Count);
            List<Question> AllQ= db.Table<Question>().Skip(toSkip).Where(x=>x.Type==Materials.History).Take(5).ToList();
            return AllQ; */
        }
        public List<Question> allQScince()
        {
            QuestionsCrud connect = new QuestionsCrud();
            var db = new SQLiteConnection(connect.pathDB);
            /*List<Qustion> AllQ = db.Table<Qustion>().Where(x=>x.Type==Materials.History).ToList();
            return AllQ;*/
            Random rand = new Random();
            int toSkip = rand.Next(0, db.Table<Question>().ToList().Count);
            List<Question> AllQ = db.Table<Question>().Skip(toSkip).Where(x => x.Type == Materials.Science).Take(5).ToList();
            return AllQ;
        }
        public List<Question> allQSports()
        {
            QuestionsCrud connect = new QuestionsCrud();
            var db = new SQLiteConnection(connect.pathDB);
            /*List<Qustion> AllQ = db.Table<Qustion>().Where(x=>x.Type==Materials.History).ToList();
            return AllQ;*/
            Random rand = new Random();
            int toSkip = rand.Next(0, db.Table<Question>().ToList().Count);
            List<Question> AllQ = db.Table<Question>().Skip(toSkip).Where(x => x.Type == Materials.Sports).Take(5).ToList();
            return AllQ;
        }
        public List<Question> allQGeo()
        {
            QuestionsCrud connect = new QuestionsCrud();
            var db = new SQLiteConnection(connect.pathDB);
            /*List<Qustion> AllQ = db.Table<Qustion>().Where(x=>x.Type==Materials.History).ToList();
            return AllQ;*/
            Random rand = new Random();
            int toSkip = rand.Next(0, db.Table<Question>().ToList().Count);
            List<Question> AllQ = db.Table<Question>().Skip(toSkip).Where(x => x.Type == Materials.Geography).Take(5).ToList();
            return AllQ;
        }
    }
   


}
