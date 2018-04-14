
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*; 
import java.lang.reflect.*;


class Singleton{
    
    private static Singleton obj = new Singleton();
    public String str;
    private Singleton(){}
    
    static Singleton getSingleInstance(){
        return obj;
    }

}
