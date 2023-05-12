from flask import Flask, render_template, request, redirect, url_for
import stripe

# Configure Stripe API keys
stripe.api_key = "your_stripe_secret_key"
stripe_public_key = "your_stripe_public_key"

app = Flask(__name__)

# Define routes
@app.route("/")
def index():
    return render_template("index.html")

@app.route("/shop")
def shop():
    return render_template("shop.html", stripe_public_key=stripe_public_key)

@app.route("/charge", methods=["POST"])
def charge():
    amount = 500  # Example amount
    customer = stripe.Customer.create(
        email=request.form["stripeEmail"],
        source=request.form["stripeToken"]
    )
    charge = stripe.Charge.create(
        customer=customer.id,
        amount=amount,
        currency="usd",
        description="Example charge"
    )
    return redirect(url_for("thank_you"))

@app.route("/thank-you")
def thank_you():
    return render_template("thank-you.html")

# Run the app
if __name__ == "__main__":
    app.run(debug=True)
