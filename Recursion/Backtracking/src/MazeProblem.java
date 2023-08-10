import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {
        System.out.println(NoOfPaths(3, 3));
        Path("", 3, 3);
        ArrayList<String> ans = PathRet("", 3, 3);
        System.out.println(ans);
        System.out.println("C is for Diagonal");
        ArrayList<String> ans2 = PathRetDiagonally("", 3, 3);
        System.out.println(ans2);
    }

    static int NoOfPaths(int r, int c){
        if(r==1 || c==1){
            return 1;
        }

        int left = NoOfPaths(r-1, c);
        int right = NoOfPaths(r, c-1);

        return left + right;
    }

    static void Path(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(c > 1){
            Path(p + "R", r, c-1);
        }
        if(r > 1){
            Path(p + "D", r-1, c);
        }
    }

    static ArrayList<String> PathRet(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            //here the list.add is included in the list so as to build a list in whihc all the local lsist been made in the code are added in the main or the external list
            list.add(p);
            return list;
        }

        //To build a local list for each pattern formed in the codebase
        ArrayList<String> list = new ArrayList<>();

        if (c > 1){
            list.addAll(PathRet(p + "R", r, c-1));
        }
        if (r > 1){
            list.addAll(PathRet(p + "D", r-1, c));
        }

        return list;
    }

    static ArrayList<String> PathRetDiagonally(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            //here the list.add is included in the list so as to build a list in whihc all the local lsist been made in the code are added in the main or the external list
            list.add(p);
            return list;
        }

        //To build a local list for each pattern formed in the codebase
        ArrayList<String> list = new ArrayList<>();

        if (c > 1){
            list.addAll(PathRetDiagonally(p + "R", r, c-1));
        }
        if (r > 1){
            list.addAll(PathRetDiagonally(p + "D", r-1, c));
        }
        if (r > 1 && c > 1){
            list.addAll(PathRetDiagonally(p + "C", r-1,c-1 ));
        }

        return list;
    }
}