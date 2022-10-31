//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
         if(a.length()==b.length()){
            int arr1[] =new int[200];
            int arr2[] =new int[200];
            for(int i=0;i<a.length();i++){
                arr1[a.charAt(i)]++;
            }
            for(int i=0;i<b.length();i++){
                arr2[b.charAt(i)]++;
            }
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]==arr2[i]){
                    continue;
                }else{
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
        
    }
}
