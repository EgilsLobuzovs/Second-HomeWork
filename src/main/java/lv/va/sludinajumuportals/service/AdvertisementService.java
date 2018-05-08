package lv.va.sludinajumuportals.service;

import lv.va.sludinajumuportals.domain.Advertisement;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdvertisementService {

    String name = "Egils";

    public List<Advertisement> hardcodedAdvertisementList;
    public List<Advertisement> reverseAdvertisementList;

    public AdvertisementServive(){
        hardcodedAdvertisementList = hardcodedAdvertisementIntitialization();
    }

    public Advertisement getAdvertisement() {
        Advertisement advertisement = new Advertisement(1L, "Pardod māju", "Pārdod lielu māju", "Jānis");
        return advertisement;
    }

    public ArrayList<Advertisement> getAdvertisementList() {
        ArrayList<Advertisement> advertisements = new ArrayList<>();
        Advertisement advertisement = new Advertisement(1L, "Pardod māju", "Pārdod lielu māju", "Jānis");


        advertisements.add(advertisement);

        return advertisements;
    }

    private List<Advertisement> hardcodedAdvertisementIntitialization(){
        List<Advertisement> advertisements = new ArrayList<>();
        for(int i = 1; i< name.length();i++){
            Advertisement advertisement = new Advertisement(Long.valueOf(i),"House","Selling house on Terbatas iela",getAuthorName(i))
            advertisements.add(advertisement);
        }
        return advertisements;
    }

    private String getAuthorName(int i){
        if(i % 2 == 0){
            return;
        }
    }
}
