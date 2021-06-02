using System;
using System.Collections.Generic;
//using System.ComponentModel.DataAnnotations.Schema;
using System.Text;
using SQLite;

namespace TestInfo.Models
{
  public  enum Materials { History, Geography, Science, Sports }
    [Table("questions")]
    class Question
    {
        [PrimaryKey,AutoIncrement]
        public int id { get; set; }
        public string qustion { get; set; }
        public string answer_a { get; set; }
        public string answer_b { get; set; }
        public string answer_c { get; set; }
        public string answer_d { get; set; }
        public string correct_answer { get; set; }
        public Materials Type { get; set; }
    }
}
