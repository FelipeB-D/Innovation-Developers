public class Empresa {
    //Declaracion de los atributos de la clase
    //Empresa según la guía
    //Aporte Angela Castro (Pendiente aprobacion grupo y posibles cambios)

    private String nombreEmpresa;
    private String direccionEmpresa;
    private int telefonoEmpresa;
    private int NITEmpresa;

    //Metodos de la clase
    Public Empresa (String nombreEmpresa, String direccionEmpresa, int telefonoEmpresa, int NITEmpresa){
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.NITEmpresa = NITEmpresa;
    }

    //Getters and Setters
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    public void setNombreEmpresa(String nombreEmpresa){
        this.nombreEmpresa = nombreEmpresa;
    }
    public String getDireccionEmpresa () {
        return direccionEmpresa;
    }
    public void setDireccionEmpresa (String direccionEmpresa){
        this.direccionEmpresa = direccionEmpresa;
    }
    public int getTelefonoEmpresa() {
        return telefonoEmpresa;
    }
    public void setTelefonoEmpresa(int telefonoEmpresa){
        this.telefonoEmpresa = telefonoEmpresa;
    }
    public int setNITEmpresa() {
        return NITEmpresa;
    }
    public void getNITEmpresa (int NITEmpresa){
        this.NITEmpresa = NITEmpresa;
    }
}