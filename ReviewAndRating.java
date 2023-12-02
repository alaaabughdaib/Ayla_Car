package aylacar.acceptance_tests;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import aylacar.Installation;
import aylacar.Manage;
import aylacar.Product;
import aylacar.installation_frame;
import aylacar.p1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class ReviewAndRating {

    p1 p;
    JButton button = new JButton();
    int star=0;
    String comment=null;
    Manage m = new Manage();
    Product pp;
    Installation i = new Installation();
    
	
	
	
	
	
	
    @Given("the customer is on the product details page")
    public void theCustomerIsOnTheProductDetailsPage() {
    	p= new p1();
    }

    @When("the customer clicks on the {string} button")
    public void theCustomerClicksOnTheButton(String buttonName) {
       
    	button = p.getCommentButton();
		ActionListener[] listeners = button.getActionListeners();
		for (ActionListener listener : listeners) {
		    listener.actionPerformed(new ActionEvent(button, ActionEvent.ACTION_PERFORMED, ""));
		}
    }

    @When("provides a review with comments and a rating (e.g., {int} stars)")
    public void providesAReviewWithCommentsAndARating(int rating) {
       comment ="Nice Product";
       star=4;
    }

    @When("submits the review")
    public void submitsTheReview() {
       
    }

    @Then("the review and rating should be saved for the product")
    public void theReviewAndRatingShouldBeSavedForTheProduct() {
    	 pp.setComments(comment);
    	 pp.setRatings(star);
    }

    @Then("the product's average rating should be updated")
    public void theProductsAverageRatingShouldBeUpdated() {
     pp.updateRating(star);
      
    }
    
    

    
    @Given("the customer has requested an installation service")
    public void theCustomerHasRequestedAnInstallationService() {
       JButton ask=new JButton();
       ask.doClick();
    }

    @When("the installation is completed")
    public void theInstallationIsCompleted() {
        i.checkComplete();
        
    }

    @Then("the installation service's average rating should be updated")
    public void theInstallationServicesAverageRatingShouldBeUpdated() {
    	
          }

    
    
    @Given("the customer is on the product details page")
    public void theCustomerIsOnTheProductDetailsPageForViewingAverageRatingsAndReviews() {
    	p=new p1();
        }

    @Then("the customer should see the average rating for the product")
    public void theCustomerShouldSeeTheAverageRatingForTheProduct() {
      }

    @Then("a summary of reviews, including comments and individual ratings, should be displayed")
    public void aSummaryOfReviewsIncludingCommentsAndIndividualRatingsShouldBeDisplayed() {
         }

   
    @Given("the customer is on the installation service details page")
    public void theCustomerIsOnTheInstallationServiceDetailsPageForViewingAverageRatingsAndReviews() {
       installation_frame f=new installation_frame();
    }

    @Then("the customer should see the average rating for the installation service")
    public void theCustomerShouldSeeTheAverageRatingForTheInstallationService() {
        }

    @Then("a summary of reviews, including comments and individual ratings, should be displayed for the installation service")
    public void aSummaryOfReviewsIncludingCommentsAndIndividualRatingsShouldBeDisplayedForTheInstallationService() {
   
    }
}