 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          Integer returnFactVal = 1;
          Integer i = 1;
          if(number ==0){
              return returnFactVal; 
            }
            for(i =1;i<=number;i++){
                returnFactVal *=i;
            }
     
          return returnFactVal;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          return null;
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
/*          char [] wordArr = word.toCharArray();
          String alph ="abcdefghijklmnopqrstuvwxyz";
          char[] alphArr = alph.toCharArray();
          int charCount = 0; 
          while(charCount < wordArr.length){
          for(int i =0; i < alphArr.length;i++){
              if(alphArr[i] == wordArr[charCount]){
                  if(alphArr[i] == 'x'){
                      //Ran out of time
                    }
              wordArr[charCount] = alphArr[i];
            }
        }
    }
        String encryption = new String(wordArr);
        return encryption; 
    }*/
    return null;
}
}
