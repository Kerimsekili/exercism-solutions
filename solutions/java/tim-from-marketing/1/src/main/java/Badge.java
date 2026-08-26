class Badge {
String owner = "owner";
    public String print(Integer id, String name, String department) {
        if (id == null && department == null) {
            return String.format("%s - %s",name,owner.toUpperCase());
        }

        if (id == null) {
            return String.format("%s - %s",name,department.toUpperCase());

        }
        if (department == null) {
            return String.format("[%d] - %s - %s",id,name,owner.toUpperCase());

        }
        return String.format("[%d] - %s - %s",id,name,department.toUpperCase());
    }
}
