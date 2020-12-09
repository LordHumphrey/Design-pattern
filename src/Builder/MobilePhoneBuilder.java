package Builder;


/**
 * @author Tao
 */
public class MobilePhoneBuilder {
    private String CPU;
    private String memory;
    private String battery;
    private String screen;
    private String camera;
    private String GPS;
    private String NFC;
    private String fingerprintRecognition;

    private MobilePhoneBuilder(Builder builder) {
        this.CPU = builder.CPU;
        this.memory = builder.memory;
        this.battery = builder.battery;
        this.screen = builder.screen;
        this.camera = builder.camera;
        this.GPS = builder.GPS;
        this.NFC = builder.NFC;
        this.fingerprintRecognition = builder.fingerprintRecognition;
    }

    public static class Builder {
        private String CPU;
        private String memory;
        private String battery;
        private String screen;
        private String camera;
        private String GPS;
        private String NFC;
        private String fingerprintRecognition;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setMemory(String memory) {
            this.memory = memory;
            return this;

        }

        public Builder setBattery(String battery) {
            this.battery = battery;
            return this;
        }

        public Builder setScreen(String screen) {
            this.screen = screen;
            return this;

        }

        public Builder setCamera(String camera) {
            this.camera = camera;
            return this;

        }

        public Builder setGPS(String GPS) {
            this.GPS = GPS;
            return this;
        }

        public Builder setNFC(String NFC) {
            this.NFC = NFC;
            return this;

        }

        public Builder setFingerprintRecognition(String fingerprintRecognition) {
            this.fingerprintRecognition = fingerprintRecognition;
            return this;
        }

        public MobilePhoneBuilder build() {
            return new MobilePhoneBuilder(this);
        }
    }

    @Override
    public String toString() {
        return "MobilePhoneBuilder{" +
                "CPU='" + CPU + '\'' +
                ", memory='" + memory + '\'' +
                ", battery='" + battery + '\'' +
                ", screen='" + screen + '\'' +
                ", camera='" + camera + '\'' +
                ", GPS='" + GPS + '\'' +
                ", NFC='" + NFC + '\'' +
                ", fingerprintRecognition='" + fingerprintRecognition + '\'' +
                '}';
    }
}

class TestMobilePhoneBuilder {
    public static void main(String[] args) {
        MobilePhoneBuilder mobilePhoneBuilder =
                new MobilePhoneBuilder.Builder().setCPU("晓龙 888").setMemory(
                        "16GB").setBattery("5000mAh").setScreen("三星").setCamera("IMX 586").setFingerprintRecognition("屏下指纹").setGPS("北斗").setNFC("全功能NFC").build();
        System.out.println(mobilePhoneBuilder.toString());
    }
}
