//import play.*;
//import play.api.OptionalSourceMapper;
//import play.api.UsefulException;
//import play.api.routing.Router;
//import play.http.DefaultHttpErrorHandler;
//import play.mvc.Http.*;
//import play.mvc.*;
//
//import javax.inject.*;
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.CompletionStage;
//import play.http.HttpErrorHandler;
//import play.mvc.*;
//import play.mvc.Http.*;
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.CompletionStage;
//import javax.inject.Singleton;
//
//@Singleton
//public class ErrorHandler extends DefaultHttpErrorHandler  implements  HttpErrorHandler {
//
//
//    @Inject
//    public ErrorHandler(Configuration configuration, Environment environment,
//                        OptionalSourceMapper sourceMapper, Provider<Router> routes) {
//        super(configuration, environment, sourceMapper, routes);
//    }
//
//    @Override
//    public CompletionStage<Result> onClientError(RequestHeader request, int statusCode, String message) {
//        return CompletableFuture.completedFuture(
//                Results.status(statusCode,views.html.errorPage.render(statusCode+" Error",message,""))
//        );    }
//
//    protected CompletionStage<Result> onProdServerError(RequestHeader request, UsefulException exception) {
//        return CompletableFuture.completedFuture(
//                Results.internalServerError(views.html.errorPage.render("internal Server Error","internal Server Error:" + exception.getMessage(),""))
//        );
//    }
//
//    protected CompletionStage<Result> onForbidden(RequestHeader request, String message) {
//        return CompletableFuture.completedFuture(
//                Results.forbidden(views.html.errorPage.render("Forbidden","You're not allowed to access this resource "+message,""))
//        );
//    }
//    protected CompletionStage<Result> onNotFound(RequestHeader request, String message) {
//        return CompletableFuture.completedFuture(
//                Results.notFound(views.html.errorPage.render("404 Not Found",message,""))
//        );
//    }
//
//    protected CompletionStage<Result> onBadRequest(RequestHeader request, String message) {
//        return CompletableFuture.completedFuture(
//                Results.badRequest(views.html.errorPage.render("Bad Request",message,""))
//        );
//    }
//
//    protected CompletionStage<Result> onOtherClientError(RequestHeader request, int statusCode, String message) {
//        return CompletableFuture.completedFuture(
//                Results.status(statusCode,views.html.errorPage.render(statusCode+" error",message,""))
//        );
//    }
//
//    @Override
//    public CompletionStage<Result> onServerError(RequestHeader request, Throwable exception) {
//        return CompletableFuture.completedFuture(
//                Results.status(404,views.html.errorPage.render(" error","",""))
//        );    }
//}