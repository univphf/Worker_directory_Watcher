import com.ht.FolderSpyWorker.FolderSpyWorker;

/**
 * @author tondeur-h
 */
public class MainWorkerSpyFolder {
    
    FolderSpyWorker folderSpyWorker;
    String SourcePath="c:/temp";
    
    public static void main (String [] argv) throws InterruptedException
    {
        MainWorkerSpyFolder MWS = new MainWorkerSpyFolder();   
    }

    /***************
     * Constructeur
     * @throws java.lang.InterruptedException
     ***************/
    public MainWorkerSpyFolder() throws InterruptedException 
    {  folderSpyWorker=new FolderSpyWorker(SourcePath);
        //Créer le thred
        Thread folderSpyThread = new Thread(folderSpyWorker);
        //Lancer le thread
        folderSpyThread.start();         
 
        while (true)
        {
            System.out.println("Attente en ligne, je ne fait rien...");
            Thread.sleep(5000); //toutes les 5 secondes
        }
        
         //Fermer le Thread
        //folderSpyThread.interrupt();
    }

}
