package ESGI5.projetDDD.Exception;

public class NoCandidateMatchingException extends Exception {

    public NoCandidateMatchingException(String message) {
        super("Aucun candidat trouvé.");
    }
}
