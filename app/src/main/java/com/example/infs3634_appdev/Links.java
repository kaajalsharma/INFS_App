package com.example.infs3634_appdev;

class Links {
    private int LinkID;

    public int getLinkID() {
        return LinkID;
    }

    public void setLinkID(int linkID) {
        LinkID = linkID;
    }

    public String getLinkDesc() {
        return LinkDesc;
    }

    public void setLinkDesc(String linkDesc) {
        LinkDesc = linkDesc;
    }

    public String getLink() {
        return Link1;
    }

    public void setLink(String link) {
        Link1 = link;
    }

    public String getLink2() {
        return Link2;
    }

    public void setLink2(String link2) {
        Link2 = link2;
    }

    public String getLink1() {
        return Link1;
    }

    public void setLink1(String link1) {
        Link1 = link1;
    }

    public String Link2;

    private String LinkDesc;
    private String Link1;



    public Links(int linkID, String linkDesc, String link1, String link2) {
        this.LinkID = linkID;
        this.LinkDesc = linkDesc;
        this.Link1 = link1;
        this.Link2=link2;
    }
}

