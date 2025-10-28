package _22_Bean;

public class Title {

    private String title;
    private String titleId;
    private String titleName;
    private String titleInfo;
    private int id;
    private String nickname;
    private int createtime;
    private int settime;

    public Title(String title, String titleId, String titleName, String titleInfo, int id, String nickname, int createtime, int settime) {
        this.title = title;
        this.titleId = titleId;
        this.titleName = titleName;
        this.titleInfo = titleInfo;
        this.id = id;
        this.nickname = nickname;
        this.createtime = createtime;
        this.settime = settime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getTitleInfo() {
        return titleInfo;
    }

    public void setTitleInfo(String titleInfo) {
        this.titleInfo = titleInfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getCreatetime() {
        return createtime;
    }

    public void setCreatetime(int createtime) {
        this.createtime = createtime;
    }

    public int getSettime() {
        return settime;
    }

    public void setSettime(int settime) {
        this.settime = settime;
    }

    @Override
    public String toString() {
        return "Title (title = " + title + "titleId = " + titleId + "titleName = " + titleName + "titleInfo = " + titleInfo + " id = " + id + " nickname =" + nickname + " createtime = " + createtime + "settime = " + settime;
}}
