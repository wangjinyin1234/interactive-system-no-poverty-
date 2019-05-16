package com.hualala.openapiPlatform.model.dto;

import java.io.Serializable;

public class BfPredict implements Serializable {
    /**
     * A class working as an entity of information without prediction.
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bfpredict.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bfpredict.countyName
     *
     * @mbg.generated
     */
    private String countyname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bfpredict.foodstampRate
     *
     * @mbg.generated
     */
    private String foodstamprate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bfpredict.povertyRate
     *
     * @mbg.generated
     */
    private String povertyrate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bfpredict.malePovertyRate
     *
     * @mbg.generated
     */
    private String malepovertyrate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bfpredict.femalePovertyRate
     *
     * @mbg.generated
     */
    private String femalepovertyrate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bfpredict.underhighschoolPovertyRate
     *
     * @mbg.generated
     */
    private String underhighschoolpovertyrate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bfpredict.highschoolPovertyRate
     *
     * @mbg.generated
     */
    private String highschoolpovertyrate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bfpredict.collegePovertyRate
     *
     * @mbg.generated
     */
    private String collegepovertyrate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bfpredict.bachelorPovertyRate
     *
     * @mbg.generated
     */
    private String bachelorpovertyrate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bfpredict.disabilityCorelation
     *
     * @mbg.generated
     */
    private String disabilitycorelation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bfpredict.avgHouseAgeCorelation
     *
     * @mbg.generated
     */
    private String avghouseagecorelation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bfpredict.avgFuelUseageCorelation
     *
     * @mbg.generated
     */
    private String avgfueluseagecorelation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bfpredict.fulljobCorelation
     *
     * @mbg.generated
     */
    private String fulljobcorelation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bfpredict.partjobCorelation
     *
     * @mbg.generated
     */
    private String partjobcorelation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bfpredict.nojobCorelation
     *
     * @mbg.generated
     */
    private String nojobcorelation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bfpredict.population
     *
     * @mbg.generated
     */
    private String population;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bfpredict.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bfpredict
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bfpredict.id
     *
     * @return the value of bfpredict.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bfpredict.id
     *
     * @param id the value for bfpredict.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bfpredict.countyName
     *
     * @return the value of bfpredict.countyName
     *
     * @mbg.generated
     */
    public String getCountyname() {
        return countyname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bfpredict.countyName
     *
     * @param countyname the value for bfpredict.countyName
     *
     * @mbg.generated
     */
    public void setCountyname(String countyname) {
        this.countyname = countyname == null ? null : countyname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bfpredict.foodstampRate
     *
     * @return the value of bfpredict.foodstampRate
     *
     * @mbg.generated
     */
    public String getFoodstamprate() {
        return foodstamprate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bfpredict.foodstampRate
     *
     * @param foodstamprate the value for bfpredict.foodstampRate
     *
     * @mbg.generated
     */
    public void setFoodstamprate(String foodstamprate) {
        this.foodstamprate = foodstamprate == null ? null : foodstamprate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bfpredict.povertyRate
     *
     * @return the value of bfpredict.povertyRate
     *
     * @mbg.generated
     */
    public String getPovertyrate() {
        return povertyrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bfpredict.povertyRate
     *
     * @param povertyrate the value for bfpredict.povertyRate
     *
     * @mbg.generated
     */
    public void setPovertyrate(String povertyrate) {
        this.povertyrate = povertyrate == null ? null : povertyrate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bfpredict.malePovertyRate
     *
     * @return the value of bfpredict.malePovertyRate
     *
     * @mbg.generated
     */
    public String getMalepovertyrate() {
        return malepovertyrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bfpredict.malePovertyRate
     *
     * @param malepovertyrate the value for bfpredict.malePovertyRate
     *
     * @mbg.generated
     */
    public void setMalepovertyrate(String malepovertyrate) {
        this.malepovertyrate = malepovertyrate == null ? null : malepovertyrate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bfpredict.femalePovertyRate
     *
     * @return the value of bfpredict.femalePovertyRate
     *
     * @mbg.generated
     */
    public String getFemalepovertyrate() {
        return femalepovertyrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bfpredict.femalePovertyRate
     *
     * @param femalepovertyrate the value for bfpredict.femalePovertyRate
     *
     * @mbg.generated
     */
    public void setFemalepovertyrate(String femalepovertyrate) {
        this.femalepovertyrate = femalepovertyrate == null ? null : femalepovertyrate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bfpredict.underhighschoolPovertyRate
     *
     * @return the value of bfpredict.underhighschoolPovertyRate
     *
     * @mbg.generated
     */
    public String getUnderhighschoolpovertyrate() {
        return underhighschoolpovertyrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bfpredict.underhighschoolPovertyRate
     *
     * @param underhighschoolpovertyrate the value for bfpredict.underhighschoolPovertyRate
     *
     * @mbg.generated
     */
    public void setUnderhighschoolpovertyrate(String underhighschoolpovertyrate) {
        this.underhighschoolpovertyrate = underhighschoolpovertyrate == null ? null : underhighschoolpovertyrate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bfpredict.highschoolPovertyRate
     *
     * @return the value of bfpredict.highschoolPovertyRate
     *
     * @mbg.generated
     */
    public String getHighschoolpovertyrate() {
        return highschoolpovertyrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bfpredict.highschoolPovertyRate
     *
     * @param highschoolpovertyrate the value for bfpredict.highschoolPovertyRate
     *
     * @mbg.generated
     */
    public void setHighschoolpovertyrate(String highschoolpovertyrate) {
        this.highschoolpovertyrate = highschoolpovertyrate == null ? null : highschoolpovertyrate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bfpredict.collegePovertyRate
     *
     * @return the value of bfpredict.collegePovertyRate
     *
     * @mbg.generated
     */
    public String getCollegepovertyrate() {
        return collegepovertyrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bfpredict.collegePovertyRate
     *
     * @param collegepovertyrate the value for bfpredict.collegePovertyRate
     *
     * @mbg.generated
     */
    public void setCollegepovertyrate(String collegepovertyrate) {
        this.collegepovertyrate = collegepovertyrate == null ? null : collegepovertyrate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bfpredict.bachelorPovertyRate
     *
     * @return the value of bfpredict.bachelorPovertyRate
     *
     * @mbg.generated
     */
    public String getBachelorpovertyrate() {
        return bachelorpovertyrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bfpredict.bachelorPovertyRate
     *
     * @param bachelorpovertyrate the value for bfpredict.bachelorPovertyRate
     *
     * @mbg.generated
     */
    public void setBachelorpovertyrate(String bachelorpovertyrate) {
        this.bachelorpovertyrate = bachelorpovertyrate == null ? null : bachelorpovertyrate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bfpredict.disabilityCorelation
     *
     * @return the value of bfpredict.disabilityCorelation
     *
     * @mbg.generated
     */
    public String getDisabilitycorelation() {
        return disabilitycorelation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bfpredict.disabilityCorelation
     *
     * @param disabilitycorelation the value for bfpredict.disabilityCorelation
     *
     * @mbg.generated
     */
    public void setDisabilitycorelation(String disabilitycorelation) {
        this.disabilitycorelation = disabilitycorelation == null ? null : disabilitycorelation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bfpredict.avgHouseAgeCorelation
     *
     * @return the value of bfpredict.avgHouseAgeCorelation
     *
     * @mbg.generated
     */
    public String getAvghouseagecorelation() {
        return avghouseagecorelation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bfpredict.avgHouseAgeCorelation
     *
     * @param avghouseagecorelation the value for bfpredict.avgHouseAgeCorelation
     *
     * @mbg.generated
     */
    public void setAvghouseagecorelation(String avghouseagecorelation) {
        this.avghouseagecorelation = avghouseagecorelation == null ? null : avghouseagecorelation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bfpredict.avgFuelUseageCorelation
     *
     * @return the value of bfpredict.avgFuelUseageCorelation
     *
     * @mbg.generated
     */
    public String getAvgfueluseagecorelation() {
        return avgfueluseagecorelation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bfpredict.avgFuelUseageCorelation
     *
     * @param avgfueluseagecorelation the value for bfpredict.avgFuelUseageCorelation
     *
     * @mbg.generated
     */
    public void setAvgfueluseagecorelation(String avgfueluseagecorelation) {
        this.avgfueluseagecorelation = avgfueluseagecorelation == null ? null : avgfueluseagecorelation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bfpredict.fulljobCorelation
     *
     * @return the value of bfpredict.fulljobCorelation
     *
     * @mbg.generated
     */
    public String getFulljobcorelation() {
        return fulljobcorelation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bfpredict.fulljobCorelation
     *
     * @param fulljobcorelation the value for bfpredict.fulljobCorelation
     *
     * @mbg.generated
     */
    public void setFulljobcorelation(String fulljobcorelation) {
        this.fulljobcorelation = fulljobcorelation == null ? null : fulljobcorelation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bfpredict.partjobCorelation
     *
     * @return the value of bfpredict.partjobCorelation
     *
     * @mbg.generated
     */
    public String getPartjobcorelation() {
        return partjobcorelation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bfpredict.partjobCorelation
     *
     * @param partjobcorelation the value for bfpredict.partjobCorelation
     *
     * @mbg.generated
     */
    public void setPartjobcorelation(String partjobcorelation) {
        this.partjobcorelation = partjobcorelation == null ? null : partjobcorelation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bfpredict.nojobCorelation
     *
     * @return the value of bfpredict.nojobCorelation
     *
     * @mbg.generated
     */
    public String getNojobcorelation() {
        return nojobcorelation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bfpredict.nojobCorelation
     *
     * @param nojobcorelation the value for bfpredict.nojobCorelation
     *
     * @mbg.generated
     */
    public void setNojobcorelation(String nojobcorelation) {
        this.nojobcorelation = nojobcorelation == null ? null : nojobcorelation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bfpredict.population
     *
     * @return the value of bfpredict.population
     *
     * @mbg.generated
     */
    public String getPopulation() {
        return population;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bfpredict.population
     *
     * @param population the value for bfpredict.population
     *
     * @mbg.generated
     */
    public void setPopulation(String population) {
        this.population = population == null ? null : population.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bfpredict.status
     *
     * @return the value of bfpredict.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bfpredict.status
     *
     * @param status the value for bfpredict.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bfpredict
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", countyname=").append(countyname);
        sb.append(", foodstamprate=").append(foodstamprate);
        sb.append(", povertyrate=").append(povertyrate);
        sb.append(", malepovertyrate=").append(malepovertyrate);
        sb.append(", femalepovertyrate=").append(femalepovertyrate);
        sb.append(", underhighschoolpovertyrate=").append(underhighschoolpovertyrate);
        sb.append(", highschoolpovertyrate=").append(highschoolpovertyrate);
        sb.append(", collegepovertyrate=").append(collegepovertyrate);
        sb.append(", bachelorpovertyrate=").append(bachelorpovertyrate);
        sb.append(", disabilitycorelation=").append(disabilitycorelation);
        sb.append(", avghouseagecorelation=").append(avghouseagecorelation);
        sb.append(", avgfueluseagecorelation=").append(avgfueluseagecorelation);
        sb.append(", fulljobcorelation=").append(fulljobcorelation);
        sb.append(", partjobcorelation=").append(partjobcorelation);
        sb.append(", nojobcorelation=").append(nojobcorelation);
        sb.append(", population=").append(population);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}