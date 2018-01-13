__________________________________________________________________________________________

Block World For Team (BW4T) Document Version 1.0 07/01/2017
__________________________________________________________________________________________


-------------------------------------------------------------------------------------------
General Usage Notes
------------------------------------------------------------------------------------------
- This documents will help you to run Block World for Team 
- The Bot entitities find the block with the rooms present according to the sequence of colors specified
- The 'agentcount' init parameter is used to specify the number of bots running in the environment
- The maximum number of bots which can concurrently run in an environment are equal to number of free entities.


-------------------------------------------------------------------------------------------
System Requiements:
-------------------------------------------------------------------------------------------
- Java JRE 8 installed (JRE 7 or above)
- Java JRE 8 system Requirement for different operating systems can be found 
  from the below link
  https://www.java.com/en/download/help/sysreq.xml
- Eclipse IDE (v3.6 or higher)
  Can be Downloaded from http://www.eclipse.org/downloads/eclipse-packages/
- Integrated ASTRA plugin with the Eclipse IDE 
  Instructions can be found at: http://astralanguage.com/wordpress/docs/installing-the-astra-ide/
- bw4t-server-3.8.6.jar (Block  World for Team Server Java Archive File)

 
-------------------------------------------------------------------------------------------
Running BW4T Application on Windows
-------------------------------------------------------------------------------------------
1. 	Unzip the BW4T_16201447.zip file. 
		i. The source code folder contains the implementation of BW4T using ASTRA
		ii. The second file is the bw4t-server-3.8.6.jar (Block  World for Team Server Java Archive File)

2.	Import the BlockWorld4Team folder in Eclipse as General poject and resolve the dependencies.
	Insructions on how to import a project in Eclipse can be found on : 
	http://agile.csc.ncsu.edu/SEMaterials/tutorials/import_export/

3. 	Run the bw4t-server-3.8.6.jar executable, by double clicking on it.
		i. The different maps can be selected by choosing the desired map from "Change Map" dropdown
		ii. The Reset button re-instantiates the Block World Environment

4. 	Run the BlockMovement.ASTRA file as ASTRA Agent
		i. Locate the BlockMovement.astra file within BlockWorld4Team --> src --> BlockMovement.astra
		ii. Right click (BlockMovement.astra file) --> Go To "Run As" --> Select " 1 ASTRA Agent"

	Note:: The Default configuration is done for one bot running in the environment.
		   For running it for "n" number of bots.
			i. Update the argument for agentcount("1") in BlockMovement.astra file
			   example:
			   environment.init([agentcount("2")]) for two bots and so on.
			ii. Save the changes 
			iii.Recompile the astra project
			iv. Re-instantiate the server 
			v.  Right click (BlockMovement.astra file) --> Go To "Run As" --> Select " 1 ASTRA Agent" 
		

-------------------------------------------------------------------------------------------		
BW4T application in ASTRA can be reached at:
-------------------------------------------------------------------------------------------
Voice : 353-89211-3858

Web Site: astralanguage.com

E-mail: prashant.garg@ucdconnect.ie 

Linkedin: https://www.linkedin.com/in/prashantucd

-------------------------------------------------------------------------------------------


Copyright: Prashant Garg © 2017 All rights reserved.