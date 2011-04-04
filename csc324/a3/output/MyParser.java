import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
public class MyParser
{
    public static void main(String[] args) throws IOException
    {
        uotLexer lexer = new uotLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        uotParser parser = new uotParser(tokens);
        try {
            parser.prog();
        } catch(Exception e) { 
            System.out.println("Error!"); 
        }
        /* Note that the following will catch only the parser errors, 
         * even though there are lexer errors it might report "Parsing successful"
         */
        if (parser.getNumberOfSyntaxErrors() == 0) {    
            System.out.println("Parsing successful");
        }
        else {
            System.out.println("Parsing unsuccessful");
        }
    }    
}


