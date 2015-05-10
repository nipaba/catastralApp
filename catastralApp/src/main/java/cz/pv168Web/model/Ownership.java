package cz.pv168Web.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * Class for ownership
 */
public class Ownership implements Serializable{

   private static final long serialVersionUID = -1909341954347520115L;
   
   private Long ownerShipID;
   private Long personID;
   private Long landId;
   private Date startDate;
   private Date endDate;
   
    /**
     *
     * @return id of ownership
     */
    public Long getOwnerShipID() {
      return ownerShipID;
   }

    /**
     * Method to set ownership id
     * @param ownerShipID
     */
    public void setOwnerShipID(Long ownerShipID) {
      this.ownerShipID = ownerShipID;
   }

    /**
     *
     * @return id of person from ownership
     */
    public Long getPersonID() {
      return personID;
   }

    /**
     * Method to set person id for ownership
     * @param personID
     */
    public void setPersonID(Long personID) {
      this.personID = personID;
   }

    /**
     *
     * @return land id of ownership
     */
    public Long getLandId() {
      return landId;
   }

    /**
     * Method to set land id for ownership
     * @param landId
     */
    public void setLandId(Long landId) {
      this.landId = landId;
   }

    /**
     *
     * @return date when the ownership starts 
     */
    public Date getStartDate() {
      return startDate;
   }

    /**
     * Method to set the starting date of ownership
     * @param startDate
     */
    public void setStartDate(Date startDate) {
      this.startDate = startDate;
   }

    /**
     *
     * @return the date when the ownership ends
     */
    public Date getEndDate() {
      return endDate;
   }

    /**
     * Method to set the ending day of ownership
     * @param endDate
     */
    public void setEndDate(Date endDate) {
      this.endDate = endDate;
   }

    /**
     *
     * @return serial version id
     */
    public static long getSerialversionuid() {
      return serialVersionUID;
   }
   
   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
      result = prime * result + ((landId == null) ? 0 : landId.hashCode());
      result = prime * result
            + ((ownerShipID == null) ? 0 : ownerShipID.hashCode());
      result = prime * result + ((personID == null) ? 0 : personID.hashCode());
      result = prime * result
            + ((startDate == null) ? 0 : startDate.hashCode());
      return result;
   }
   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Ownership other = (Ownership) obj;
      if (landId == null) {
         if (other.landId != null)
            return false;
      } else if (!landId.equals(other.landId))
         return false;
      if (ownerShipID == null) {
         if (other.ownerShipID != null)
            return false;
      } else if (!ownerShipID.equals(other.ownerShipID))
         return false;
      if (personID == null) {
         if (other.personID != null)
            return false;
      } else if (!personID.equals(other.personID))
         return false;
      
      return true;
   }
   @Override
   public String toString() {
      return "Ownership [ownerShipID=" + ownerShipID + ", personID=" + personID
            + ", landId=" + landId + ", startDate=" + startDate + ", endDate="
            + endDate + "]";
   }
    
}
