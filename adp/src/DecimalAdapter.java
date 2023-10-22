public class DecimalAdapter implements DecimalInterface{
    private TwoBinary twoBinary;
    public DecimalAdapter(TwoBinary twoBinary) {
        this.twoBinary = twoBinary;
    }
    @Override
    public Integer convertDecimal() {
        String binary = twoBinary.returnBinary();
        return Integer.parseInt(binary, 2);
    }
}
