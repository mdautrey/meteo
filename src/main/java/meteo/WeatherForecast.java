package meteo;
/**
 * JSON Pojo
 */
public class WeatherForecast {
    /*
    {"coord":{"lon":-3.44,"lat":48.81},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],
    "base":"cmc stations","main":{"temp":290.6,"pressure":1003,"humidity":88,"temp_min":290.15,"temp_max":291.15},
    "wind":{"speed":5.7,"deg":180},"clouds":{"all":90},"dt":1444037400,"sys":{"type":1,"id":5639,"message":0.0035,
    "country":"FR","sunrise":1444025945,"sunset":1444067061},"id":2987863,"name":"Perros-Guirec","cod":200}
     */
    // http://wiki.fasterxml.com/JacksonInFiveMinutes

    public static class Coord {
        private String _lon, _lat;

        public String getLon(){ return _lon;}
        public String getLat(){ return _lat;}
        public void setLon(String lon){ _lon = lon;}
        public void setLat(String lat){_lat = lat;}
        public String toString(){return String.format("Coordonnées\nLattitude : %s\nLongitude : %s\n", _lat, _lon);}
    }
    public static class Main{
        private String _temp, _pressure, _humidity, _temp_min, _temp_max;
        public String getTemp(){return _temp;}
        public void setTemp(String temp){_temp = temp;}

        public String toString(){return String.format("Temperature : %s\n", _temp);}
    }
    private String _id;
    private String _name;
    private String _cod;
    public String getId(){return _id;}
    public String getName(){return _name;}
    public String getCod(){return _cod;}
    public void setId(String id){_id = id;}
    public void setName(String name){_name = name;}
    public void setCod(String cod){_cod = cod;}

    private Coord _coord;
    public Coord getCoord(){return _coord;}
    public void setCoord(Coord c){this._coord = c;}

    private Main _main;
    public Main getMain(){return _main;}
    public void setMain(Main main){_main = main;}

    public String toString(){
        String to_s;
        to_s = String.format("Id : %s\nNom : %s\nCod : %s\n ", _id, _name, _cod);
        to_s += _coord.toString();
        to_s += _main.toString();
        return to_s;
    }
    public String getText(){
        return this.toString();
    }
}