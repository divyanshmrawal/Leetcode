//Question-->
//Check if the two strings have identical character counts

//answer-->
boolean premutation(String s,String t)
if(s.length()!=t.length){
    return false;

}
int [] letter =new int[128];
char[] s_array = s.toCharArray();
for(cahr c : s_array){
    letters[c]++;
}
for(int i=0;i<t.length();i++){
    int c=(int)t.charAt(i);
    letters[c]--;
    if(letters[c]<0){
        return false;
    }
}
return true;
}