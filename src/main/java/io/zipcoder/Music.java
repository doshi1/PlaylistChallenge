package io.zipcoder;

public class Music {


    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {

        int startCount = 0;
        int endCount = 0;

    /*  while (playList[startIndex] != selection){
          startIndex ++;

          if(startIndex == playList.length ) {
              startIndex = 0;
          }
      }

        while (playList[startIndex] != selection){
         //   startIndex = playList.length -1;

            if(startIndex == 0) {
                startIndex = playList.length -1;
            }
            startIndex --;
            selection += 1;
        }

        return startIndex;

    } */

       /* int count;
        int counter = 0;
        int counterReverse = 0;


        for (int i = playList.length - 1; i > 0; i--) {
            if (!playList[i].equals(selection)) {
                counterReverse++;
            }
        }

        for (int i = startIndex; i < playList.length; i++) {
            if (!playList[i].equals(selection)) {
                counter++;
            }
        }

        count = Math.min(counter, counterReverse);
        return count;

    } */


        for(int i = 0; i<= startIndex; i++){
            startCount++;
        }

        for(int j = 0; j < playList.length; j++){
            endCount++;
        }
        if(endCount < startCount) {
            return endCount;
        }
            return startCount;
        }

    }
