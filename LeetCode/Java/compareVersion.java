public class compareVersion {
    public static int compareVersion(String version1, String version2) {
        StringBuilder ver1parse = new StringBuilder();
        StringBuilder ver2parse = new StringBuilder();
        boolean search1 = true;
        boolean search2 = true;
        int ver1int = 0;
        int ver2int = 0;
        int ver1dot = 0;
        int ver2dot = 0;
        int j =0;
        int k =0;
        int totlength = Math.max((version1.length()), (version2.length()));
        for(int i=0; i < totlength;i++){
            while(search1 || search2){
                if(search1){
                    if ((k >= version1.length()) || version1.charAt(k) == '.') {
                        search1 = false;
                        ver1dot++;
                    }else{
                        ver1parse.append(version1.charAt(k));
                    }
                    k++;

                }
                if(search2) {
                    if ((j >= version2.length()) || version2.charAt(j) == '.') {
                        search2 = false;
                        ver2dot++;
                    } else {
                        ver2parse.append(version2.charAt(j));
                    }
                    j++;
                }
            }
            if((ver1parse.toString().equalsIgnoreCase("")) || ver2parse.toString().equalsIgnoreCase("")){
                if((ver1parse.toString().equalsIgnoreCase(""))){
                    ver1parse.append("0".repeat(Math.max(0, ver2parse.length())));
                }else{
                    ver2parse.append("0".repeat(Math.max(0, ver1parse.length())));
                }
            }
            System.out.println("ver1: " + ver1parse);
            System.out.println("ver2: " + ver2parse);
            System.out.println("k:" +k);
            System.out.println("j:" +j);
            ver1int = Integer.parseInt(ver1parse.toString());
            ver2int = Integer.parseInt(ver2parse.toString());

            if(ver1int != ver2int){
                if(ver1int > ver2int){
                    return 1;
                }
                else{
                    return -1;
                }
            }
            if(k < version1.length()){
                search1 = true;
            }
            if(j < version2.length()){
                search2 = true;
            }
            if(!search1 && !search2){
                return 0;
            }
            ver1parse = new StringBuilder();
            ver2parse = new StringBuilder();
            System.out.println("loop");
        }
        return 0;
    }
//    public static void main(String[] args) {
//        int a = compareVersion("1", "0");
//        System.out.println(a);
//    }
}

//
//class compareVersion {
//    public int compareVersion(String version1, String version2) {
//        String ver1parse = "";
//        String ver2parse = "";
//        boolean search1 = true;
//        boolean search2 = true;
//        int ver1int = 0;
//        int ver2int = 0;
//        int totlength = ((version1.length()) > (version2.length())) ? version1.length() : version2.length();
//        for(int i=0; i < totlength-1;i ++){
//            while((version1.charAt(i) != '.') || (version2.charAt(i) != '.' )){
//                if(version1.charAt(i) != '.'){
//                    ver1parse += version1.charAt(i);
//                }
//                if(version2.charAt(i) != '.'){
//                    ver2parse += version2.charAt(i);
//                }
//                i++;
//            }
//            ver1int = Integer.parseInt(ver1parse);
//            ver2int = Integer.parseInt(ver2parse);
//            if(ver1int != ver2int){
//                if(ver1int > ver2int){
//                    return 1;
//                }
//                if(ver2int > ver1int){
//                    return -1;
//                }
//                else{
//                    return 0;
//                }
//            } else{
//                ver1parse = "";
//                ver2parse = "";
//            }
//        }
//        return 2;
//    }
//}