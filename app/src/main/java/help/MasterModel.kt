package help

import models.*
import java.util.*

object MasterModel {

    var isComparing = true
    var rating = Rating.YIKES

    var address = Address()
    var amenities = Amenities()
    var financial = Financial()
    var posting = Posting()
    var rental = Rental()
    var importance = Importance.Rent

    fun firstScreen(monthlyRent: Double, citySelected: Int, hasWasherDryer: Boolean, numBedrooms: Double, numBathrooms: Double, importantSelected: Int) {
        financial.monthlyRent = monthlyRent
        address.city = if(citySelected == 1) "Orem" else "Provo"
        amenities.hasWasherDryer = hasWasherDryer
        rental.numBedrooms = numBedrooms
        rental.numBathrooms = numBathrooms
        importance = when (importantSelected) {
            1 -> Importance.Rent
            2 -> Importance.Laundry
            else -> Importance.Bedrooms
        }
    }

    fun secondScreen(complex: Boolean, basement: Boolean, house: Boolean, numMonths: Double) {
        rental.complex = complex
        rental.basement = basement
        rental.house = house
        rental.contractLength = numMonths
    }

    fun thirdScreen(address: String, aptNum: String, zipCode: Int) {
        this.address.address = address
        this.address.aptNum = aptNum
        this.address.zipCode = zipCode
    }

    fun fourthScreen(utils: Double, deposit: Double, parking: Double, appFee: Double) {
        this.financial.monthlyUtilities = utils
        financial.securityDeposit = deposit
        financial.parkingFee = parking
        financial.applicationFee = appFee
    }

    fun fifthScreen(parking: Boolean, furnished: Boolean, pets: Boolean) {
        amenities.furnished = furnished
        amenities.hasParking = parking
        amenities.petFriendly = pets
    }

    fun toApiPosting(): sdk.haha.model.Posting {
        val posting = sdk.haha.model.Posting()
        posting.postingId = UUID.randomUUID().toString()
        posting.postLink = ""
        posting.datePosted = "June 10, 2020"
        posting.type = when {
            this.rental.basement -> "Basement"
            this.rental.house -> "House"
            this.rental.complex -> "Complex"
            else -> "Apartment"
        }

        posting.address = this.address.address
        posting.applicationFee = this.financial.applicationFee.toString()
        posting.aptNum = this.address.aptNum
        posting.city = this.address.city
        posting.contractLength = this.rental.contractLength.toString()
        posting.hasParking = this.amenities.hasParking
        posting.hasWasherDryer = this.amenities.hasWasherDryer
        posting.isFurnished = this.amenities.furnished
        posting.isPetFriendly = this.amenities.petFriendly
        posting.monthlyRent = this.financial.monthlyRent.toString()
        posting.monthlyUtilities = this.financial.monthlyUtilities.toString()
        posting.numBathrooms = this.rental.numBathrooms.toString()
        posting.numBedrooms = this.rental.numBedrooms.toString()
        posting.parkingFee = this.financial.parkingFee.toString()
        posting.securityDeposit = this.financial.securityDeposit.toString()
        posting.zipCode = this.address.zipCode.toString()
        return posting
    }

}

enum class Importance {
    Rent,
    Laundry,
    Bedrooms
}
enum class Rating {
    BELOW,
    AVERAGE,
    ABOVE,
    YIKES
}