using SQLite;
using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using TestInfo.Models;

namespace TestInfo.DB
{
    class QuestionsCrud 
    {
        public string pathDB = Path.Combine(Environment.GetFolderPath(System.Environment.SpecialFolder.Personal), "TestInfoDB.db3");
        public QuestionsCrud()
        {
            if (!File.Exists(pathDB))
            {
                var db = new SQLiteConnection(pathDB);
                db.CreateTable<Question>();
            }
        }

        public void Create(Question ques)
        {
            var db = new SQLiteConnection(pathDB);
            var Q = new Question();
            Q.qustion = ques.qustion;
            Q.answer_a = ques.answer_a;
            Q.answer_b = ques.answer_b;
            Q.answer_c = ques.answer_c;
            Q.answer_d = ques.answer_d;
            Q.Type = ques.Type;
            Q.correct_answer = ques.correct_answer;
            db.Insert(Q);
        }

        public void Delete(int id)
        {
            var db = new SQLiteConnection(pathDB);
            Question q = new Question();
            q.id = id;
            db.Delete(q);
        }

   
        public List<Question> Read()
        {
            var db = new SQLiteConnection(pathDB);
            List<Question> AllQ = db.Table<Question>().ToList();
            return AllQ;
            /* public Qustion Find()
        {
            var db = new SQLiteConnection(pathDB);
            Qustion Q = new Qustion();
            Q = db.Table<Qustion>().FirstOrDefault();
            return Q;
        }
        public Qustion Find(int ID)
        {
            var db = new SQLiteConnection(pathDB);
            Qustion Q = new Qustion();         
            if(ID)
            Q = db.Table<Qustion>().Where(x => x.id == ID).FirstOrDefault();       
            return Q;
        }*/
        }

        void Update(Question ques)
        {
            
        }
    }

       
    }
