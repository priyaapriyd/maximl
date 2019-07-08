
class PRM
{
  final static int NO_OF_CHARS = 256;
  static int max_distinct_char(String str,int n)
  {
    int count[] = new int[NO_OF_CHARS];
    for (int i=0;i<0;i++)
    {
      count [str.char.At(i)]++;
    }
    int max_distinct = 0;
    for(int i=0;i<NO_OF_CHARS;i++)
    {
      if (count[i]! =0)
      {
        max_distinct++;
      }
    }
    return max_distinct;
  }
    static int smallestSubstr_maxDistinctChar(String str)
    {
      int n= str.length();
      int max_distinct = max_distict_char(str,n);
      int min1 = n;
      for (int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          String subs = null;
          if(i<j)
            subs = str.substring(i,j);
          else
            subs = str.substring(j,i);
          int subs_length = subs.length();
          int subs_distinct_char = max_distinct_char(subs,subs_length);
          if subs_length<min1 && max_distinct == sub_distinct_char)
          {
            min1=sub_length;
          }
        }
      }
      return min1;
      public void main (String[] args)
      {
        String str ="abcda";
        int len = smallestsubstr_maxDistinctChar(str);
        System.out.println("the length of the smallest substring": +len);
      }
    }
