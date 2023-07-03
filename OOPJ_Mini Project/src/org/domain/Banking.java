package org.domain;

public class Banking {
	
	    //int amount = 1000;
	    public void initiate()
	    {
	        Admin_Login login = new Admin_Login();
	        try{
	            login.acceptInput();
	            login.verify();
	            
	        }catch(Exception e)
	        {
	            try{
	                login.acceptInput();
	                login.verify();
	                
	            }catch(Exception f)
	            {
	               
	             }
	        }
	    }


}
