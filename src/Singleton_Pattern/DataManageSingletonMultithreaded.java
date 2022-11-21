package Singleton_Pattern;

import java.util.ArrayList;
import java.util.List;

import Singleton_Pattern.Address;
import Singleton_Pattern.TouristPlace;

public class DataManageSingletonMultithreaded {

    private List<Address> addresses=null;
    private List<TouristPlace> touristPlaces=null;

    private static DataManageSingletonMultithreaded instance=null;
	
    private DataManageSingletonMultithreaded() {
        this.addresses = new ArrayList<>();
        this.touristPlaces = new ArrayList<>();
        System.out.println("Init object from class object DataMgr - Muntithreaded");
    }

    public static synchronized DataManageSingletonMultithreaded getInstance(){
        if(instance==null)
        {
            instance =new DataManageSingletonMultithreaded();
        }
        return instance;
    }

}

