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
        private String _temp;
        private String _pressure;
        private String _humidity;
        private String _temp_min;
        private String _temp_max;

        public String get_temp() {return _temp;}
        public void set_temp(String _temp) {this._temp = _temp;}
        public String get_pressure() {return _pressure;}
        public void set_pressure(String _pressure) {this._pressure = _pressure;}
        public String get_humidity() {return _humidity;}
        public void set_humidity(String _humidity) {this._humidity = _humidity;}
        public String get_temp_min() {return _temp_min;}
        public void set_temp_min(String _temp_min) {this._temp_min = _temp_min;}
        public String get_temp_max() {return _temp_max;}
        public void set_temp_max(String _temp_max) {this._temp_max = _temp_max;}

        public String toString(){return String.format("Temperature : %s\n", _temp);}
    }
    public static class Wind{
        private String _speed;
        private String _deg;

        public String get_speed() {return _speed;}
        public void set_speed(String _speed) {this._speed = _speed;}
        public String get_deg() {return _deg;}
        public void set_deg(String _deg) {this._deg = _deg;}

        public String toString(){
            return String.format("Vitesse du vent : %s, Direction : %s", _speed, _deg);
        }

    }
    public static class Clouds{
        private String _all;

        public String get_all() {return _all;}
        public void set_all(String _all) {this._all = _all;}
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

    private Wind _wind;
    public Wind get_wind() {return _wind;}
    public void set_wind(Wind _wind) {this._wind = _wind;}


    private Clouds _clouds;
    public Clouds get_clouds() {return _clouds;}
    public void set_clouds(Clouds _clouds) {this._clouds = _clouds;}

    public String toString(){
        String to_s;
        to_s = String.format("Id : %s\nNom : %s\nCod : %s\n ", _id, _name, _cod);
        to_s += _coord.toString();
        to_s += _main.toString();
        if(_wind!=null){to_s += _wind.toString();}
        if(_clouds!=null){to_s += _clouds.toString();}
        return to_s;
    }
    public String getText(){
        return this.toString();
    }
}