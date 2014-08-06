import java.lang.reflect.Array;
import java.util.Random;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class Compression {
    public static void main(String[] args) throws Exception {
    	
	    	for (int i = 1; i <= 1; i++) {
	    		System.out.println ("Iteration: "+ i+ "\n");
	    		Utility object = new Utility();
	    		Random rng = new Random();
	    		String allowedChars = new String ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
	    		String inputString = object.generateRandomString (rng, allowedChars, 25);	
	    		String[] options = {"BEST_COMPRESSION", "BEST_SPEED", "DEFAULT_COMPRESSION"};
	    		
	    		for (int j = 0; j < options.length; j++) {
	    			System.out.println ("Compression Type: "+ options[j]);
	    			System.out.println ("Generated Random String: "+inputString);
	        		String compressionOption = options[j];
	        		final long startTime = System.currentTimeMillis();
	        		CompressedData compressedOutput = object.compressString (inputString, compressionOption);
	        		final long endTime = System.currentTimeMillis();
		            System.out.println ("Compressed Data (bytes): "+compressedOutput.getCompressedData());
		            System.out.println ("Compression Time: "+(endTime - startTime));
		            String decompressedString = object.decompressString(compressedOutput.getCompressedData(), compressedOutput.getCompressedDataLength());
		            System.out.println ("Decompressed (Normal) String Again: " + decompressedString);
		            System.out.println ("------------------------------------------------------------");
	    		}
	    		
	    	  System.out.println ("************************************************************************");	
	    	}
    	
    }
}