package fr.cnamts.videoTech78.domaine;

public class Video {
    private int id;
    private String titre;
    private String genre;
    private String duree;
    private String dateSortie;

    public Video(int id, String titre, String genre, String duree, String dateSortie) {
        this.id = id;
        this.titre = titre;
        this.genre = genre;
        this.duree = duree;
        this.dateSortie = dateSortie;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(String dateSortie) {
        this.dateSortie = dateSortie;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", genre='" + genre + '\'' +
                ", duree=" + duree +
                ", dateSortie=" + dateSortie +
                '}';
    }
}
