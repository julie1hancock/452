package help
import io.reactivex.Single
import android.content.Context
import com.amazonaws.mobileconnectors.apigateway.ApiClientFactory
import sdk.TwitterserverClient


class Interactor {


//TODO: change api key
    fun getClient(context: Context) : TwitterserverClient {
        val factory: ApiClientFactory = ApiClientFactory().apiKey("zPszWwC2Yj347jGQ9dnwe8VesRtoSXQttx3RVlLh")
        val client = factory.build(TwitterserverClient::class.java)
        return client
    }



//TODO: change Any to Rating
//TODO:
    fun getIsScrewed(context: Context) : Single<Any>{
//        var rating = MasterModel.rating
//        var posting = MasterModel.posting
        var address = MasterModel.address
        var amenities = MasterModel.amenities
        var financial = MasterModel.financial
        var rental = MasterModel.rental
        var importance = MasterModel.importance.toString()

        return Single.create { emitter ->
            emitter.onSuccess(
                    getClient(context).gethashtagsGet("10","#hey","")
//                    getClient(context).getratingGet(address, amenities, financial, rental, importance).toRatingEnum()
            )
        }
    }

}

fun String.toRatingEnum() : Rating {
    return when {
        this.toLowerCase() == "above" -> Rating.ABOVE
        this.toLowerCase() == "average" -> Rating.AVERAGE
        this.toLowerCase() == "below" -> Rating.BELOW
        else -> Rating.YIKES
    }
}