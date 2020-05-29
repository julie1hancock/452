package help

import models.*

object MasterModel {
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

    var address = Address()
    var amenities = Amenities()
    var financial = Financial()
    var posting = Posting()
    var rental = Rental()
    var importance = Importance.Rent

}

enum class Importance {
    Rent,
    Laundry,
    Bedrooms
}