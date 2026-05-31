public int moreHistoryThanMathAbsences(){
  int count = 0;
  for(int i = 0; i <historyList.size(); i++)
    {
      CourseRecord s1 = historyList.get(i);
      for(int j = 0; j<mathList.size(); j++)
        {
          CourseRecord s2 = mathList.get(j);
          if(s1.getStudentID().equals(s2.getStudentID())
             {
               if(s1.getAbsences()>s2.getAbsences())
               {
                 count++;
               }
          }
        }
    }
  return count;

}
   
