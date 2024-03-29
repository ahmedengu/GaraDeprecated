/**
 * This class is generated by jOOQ
 */
package models.garaDB.tables.daos;


import models.garaDB.tables.Review;
import models.garaDB.tables.records.ReviewRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReviewDao extends DAOImpl<ReviewRecord, models.garaDB.tables.pojos.Review, Integer> {

    /**
     * Create a new ReviewDao without any configuration
     */
    public ReviewDao() {
        super(Review.REVIEW, models.garaDB.tables.pojos.Review.class);
    }

    /**
     * Create a new ReviewDao with an attached configuration
     */
    public ReviewDao(Configuration configuration) {
        super(Review.REVIEW, models.garaDB.tables.pojos.Review.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(models.garaDB.tables.pojos.Review object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Review> fetchById(Integer... values) {
        return fetch(Review.REVIEW.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public models.garaDB.tables.pojos.Review fetchOneById(Integer value) {
        return fetchOne(Review.REVIEW.ID, value);
    }

    /**
     * Fetch records that have <code>reviewerMemberID IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Review> fetchByReviewermemberid(Integer... values) {
        return fetch(Review.REVIEW.REVIEWERMEMBERID, values);
    }

    /**
     * Fetch records that have <code>reviewedMemberID IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Review> fetchByReviewedmemberid(Integer... values) {
        return fetch(Review.REVIEW.REVIEWEDMEMBERID, values);
    }

    /**
     * Fetch records that have <code>rating IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Review> fetchByRating(Integer... values) {
        return fetch(Review.REVIEW.RATING, values);
    }

    /**
     * Fetch records that have <code>comment IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Review> fetchByComment(String... values) {
        return fetch(Review.REVIEW.COMMENT, values);
    }

    /**
     * Fetch records that have <code>TIMESTAMP IN (values)</code>
     */
    public List<models.garaDB.tables.pojos.Review> fetchByTimestamp(Timestamp... values) {
        return fetch(Review.REVIEW.TIMESTAMP, values);
    }
}
