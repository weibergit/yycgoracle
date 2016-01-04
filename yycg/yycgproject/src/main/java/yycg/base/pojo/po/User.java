package yycg.base.pojo.po;

public class User {
    private Integer id;

    private String name;

    private Integer age;

    private String maile;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMaile() {
        return maile;
    }

    public void setMaile(String maile) {
        this.maile = maile == null ? null : maile.trim();
    }
}