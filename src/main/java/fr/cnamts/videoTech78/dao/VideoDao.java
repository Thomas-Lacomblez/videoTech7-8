package fr.cnamts.videoTech78.dao;

import fr.cnamts.videoTech78.domaine.Video;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VideoDao implements IDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Video getVideoById(int id) {

        String sqlRequest = "SELECT * FROM video where id = " + id;
        Video v1 = jdbcTemplate.queryForObject(sqlRequest, Video.class);
        return v1;    
    }

    public void createVideo(Video video) {

        String insertRequest = "INSERT INTO video(titre, genre, duree, dateSortie) VALUES(?, ?, ?, ?)"; 

        jdbcTemplate.update(insertRequest, video.getTitre(), video.getGenre(), video.getDuree(), video.getDateSortie() );

        System.out.println("Video : " + video.getTitre() + "à été créer avec succès ! ");
    }

    public Video updateVideo(Video video) {
        
        String insertRequest = "Update video SET titre = ?, genre= ?, duree = ?, dateSortie = ?, where video.id = ? "; 

        jdbcTemplate.update(insertRequest, video.getTitre(), video.getGenre(), video.getDuree(), video.getDateSortie(), video.getId() );

        System.out.println("Video : " + video.getTitre() + " à été modifier avec succès ! ");

        return video;
        
    }

    public void deleteVideo(Video video) {

        String insertRequest = "Update video SET titre = ?, genre= ?, duree = ?, dateSortie = ?, where video.id = ? "; 

        jdbcTemplate.update(insertRequest, video.getTitre(), video.getGenre(), video.getDuree(), video.getDateSortie(), video.getId() );

        System.out.println("Video : " + video.getTitre() + " à été supprimé avec succès ! ");

    }

    public List<Video> getAllVideo() {
        String query = "select * from video";
        return jdbcTemplate.queryForList(query, Video.class);
    }


    public void initialisation() {
        System.out.println("DAO: creation spring");
    }

    public void destruction() {
        System.out.println("DAO: destruction spring");
    }


}
