public class FaultReportCard{
    private String version;
    private String type;
    private String questions;
    private String Answers;
    private BufferedImage photo;
    private String geocode;
    
    
    public FaultReportCard(Fault fault){
            this.type = fault.getType();
    }
    
    public void setVesion(String version){
      this.version = version ;
      
    }
    public void setType(){
      this.version = version ;
    }
    public void setQuestion(){
      this.question = question;
    }
    public void setAnswers(){
      this.answer = answer;
    }
    
     public void setPhoto(){
        try {
              // retrieve image
              BufferedImage bi = getMyImage();
              File outputfile = new File("saved.png");
              ImageIO.write(bi, "png", outputfile);
            } catch (IOException e) {}
     }
    
    public String getVesion(){
        return this.version;
    }
    
    public String getType(){
        return this.type;
    }
    public String getAnswer(){
        return this.answer;
    }
    public String getQuestion(){
        return this.question;
    }
    public String getPhoto(){
           BufferedImage img = null;
            try {
                img = ImageIO.read(new File("demo.jpg"));
              } catch (IOException e) {
              }
    }
}
}
