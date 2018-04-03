package main.model;

/**
 * Bean which stores the emotion message to be sent to client.
 * @author Balachandar Sampath
 * @version 1.0
 */
public class ExpressiveBean {

    private boolean lookingRight;
    private boolean blink;
    private boolean rightWink;
    private boolean leftWink;
    private boolean lookingLeft;

    private double eyeBrowRaise;
    private double eyesOpen;
    private double smile;
    private double clench;
    private double lookingUp;
    private double lookingDown;

    public boolean isBlink() {
        return blink;
    }

    public void setBlink(boolean blink) {
        this.blink = blink;
    }

    public boolean isRightWink() {
        return rightWink;
    }

    public void setRightWink(boolean rightWink) {
        this.rightWink = rightWink;
    }

    public boolean isLeftWink() {
        return leftWink;
    }

    public void setLeftWink(boolean leftWink) {
        this.leftWink = leftWink;
    }

    public boolean isLookingLeft() {
        return lookingLeft;
    }

    public void setLookingLeft(boolean lookingLeft) {
        this.lookingLeft = lookingLeft;
    }

    public boolean isLookingRight() {
        return lookingRight;
    }

    public void setLookingRight(boolean lookingRight) {
        this.lookingRight = lookingRight;
    }

    public double getRaiseBrow() {
        return eyeBrowRaise;
    }

    public void setRaiseBrow(double raiseBrow) {
        this.eyeBrowRaise = raiseBrow;
    }

    public double getEyesOpen() {
        return eyesOpen;
    }

    public void setEyesOpen(double eyesOpen) {
        this.eyesOpen = eyesOpen;
    }

    public double getSmile() {
        return smile;
    }

    public void setSmile(double smile) {
        this.smile = smile;
    }

    public double getClench() {
        return clench;
    }

    public void setClench(double clench) {
        this.clench = clench;
    }

    public double getLookingUp() {
        return lookingUp;
    }

    public void setLookingUp(double lookingUp) {
        this.lookingUp = lookingUp;
    }

    public double getLookingDown() {
        return lookingDown;
    }

    public void setLookingDown(double lookingDown) {
        this.lookingDown = lookingDown;
    }

    @Override
    public String toString() {
        return "ExpressiveBean{" +
                "lookingRight=" + lookingRight +
                ", blink=" + blink +
                ", rightWink=" + rightWink +
                ", leftWink=" + leftWink +
                ", lookingLeft=" + lookingLeft +
                ", eyeBrowRaise=" + eyeBrowRaise +
                ", eyesOpen=" + eyesOpen +
                ", smile=" + smile +
                ", clench=" + clench +
                ", lookingUp=" + lookingUp +
                ", lookingDown=" + lookingDown +
                '}';
    }
}
