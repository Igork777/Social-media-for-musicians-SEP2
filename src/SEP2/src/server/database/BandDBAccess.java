package server.database;

import shared.wrappers.Band;
import shared.wrappers.Musician;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;


public interface BandDBAccess {

    HashMap<String, File> getAllBandsMusicianIsIn(int id);

    boolean removeMusicianFromBand(Musician currentMusician, Band localBand);
    ArrayList<Musician> getMusiciansInTheBand(int bandId);
}
