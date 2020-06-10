package help

import models.*

object MasterModel {

    var rating = Rating.YIKES

    var address = Address()
    var amenities = Amenities()
    var financial = Financial()
    var posting = Posting()
    var rental = Rental()
    var importance = Importance.Rent

    fun firstScreen(monthlyRent: Double, citySelected: Int, hasWasherDryer: Boolean, numBedrooms: Int, numBathrooms: Double, importantSelected: Int) {
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

    fun secondScreen(complex: Boolean, basement: Boolean, house: Boolean, numMonths: Int) {
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