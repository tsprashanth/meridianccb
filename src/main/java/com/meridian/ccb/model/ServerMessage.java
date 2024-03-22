package com.meridian.ccb.model;
public class ServerMessage {
    private int messageCategory;
    private int messageNbr;
    private String callSequence;
    private String programName;
    private String messageText;
    private String longDescription;

    public int getMessageCategory() {
        return messageCategory;
    }

    public void setMessageCategory(int messageCategory) {
        this.messageCategory = messageCategory;
    }

    public int getMessageNbr() {
        return messageNbr;
    }

    public void setMessageNbr(int messageNbr) {
        this.messageNbr = messageNbr;
    }

    public String getCallSequence() {
        return callSequence;
    }

    public void setCallSequence(String callSequence) {
        this.callSequence = callSequence;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
}
