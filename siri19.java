/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String word = "hello world";
        String data[];int k=0;
        data=word.split("");
        for(int i=0;i<data.length;i++){
            if(data[i].equals(" ")){
                k++;
            }
        System.out.println(k);	// your code goes here

            }

	}
}
