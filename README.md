# CountDownTimer

    private void countDown() {
        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                countDown.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                finish.setText("done!");
            }
        }.start();
    }
