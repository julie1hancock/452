package help
import io.reactivex.Single
import android.content.Context
import com.amazonaws.mobileconnectors.apigateway.ApiClientFactory
import sdk.haha.PostingsAPIClient
import sdk.haha.model.Posting


class Interactor {


//TODO: change api key
    fun getClient(context: Context) : PostingsAPIClient {
        val factory: ApiClientFactory = ApiClientFactory().apiKey("AKIAV75DILXDS45D6L7H,r2xXxtDatqIKSkrhWk9fsB4HZhRrd2H+5b0szMTA")
        val client = factory.build(PostingsAPIClient::class.java)
        return client
    }

    fun postPosting(context: Context) : Single<Any>{
        val apiPosting: Posting = MasterModel.toApiPosting()
        return Single.create { emitter ->
            emitter.onSuccess(
                getClient(context).postingPost(apiPosting,"application/json")
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