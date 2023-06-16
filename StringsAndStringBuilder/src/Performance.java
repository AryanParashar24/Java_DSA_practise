public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series = series + ch;
            //So here in it, it will start with an empty string and then the ans will become a then the string will become ab and so on...
            //So here a new object is actually being added every time its not making a new object but its just addingup a new object into the previous one every time
            //Its just copying the older one and then appending the new one


            /*So here it is producing so many strings which willbe of no value till we got the last one as for example in the first time it was just a then ab then abc then abcd
            and so on till abcdefghijklmnopqrstuvwxy , every time as the new object is added into the older one, the older one is of no use and nothing is pointing to them so
            here so much time will be gathered and occupied and here it will work as 1 +2+3+4+5+6+......+n as the objects get wasted so here it will be
            sum to n(n + 1) /2 and as we know in oops we refer to the largest one with the highest degree and neglecting less dominating term &constants are being neglected to thastwhy the

            Time Space Complexity = O(N ^ 2) Big O N Square notaion init way
            */
        }

        /*So in it to add n terms we are getting a time space complexity of N square which is really bad So as a solution to it would be if inspite of creating so many object s as
        in String datatype it dosent allow the modification of new object it kinda creates new object and we need a datatype which can kinda modify and add new object in the same object so as to reduce the space it occupy
        like in Array where it takes n stapes or itterations but the changes are donein the same object which is Stringbuilder */
        System.out.println(series);
    }
}
