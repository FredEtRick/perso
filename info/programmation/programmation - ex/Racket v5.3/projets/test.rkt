(define (absolute x)
  (if (< x 0)
      (- x)
      x))
(define (fact-rec n)
  (if (= n 1)
      1
      (* n
         (fact-rec (- n 1)))))
(define (fact-iter n)
  (define (iteration P cpt max)
    (if (> cpt max)
        P
        (iteration (* P cpt)
                   (+ 1 cpt)
                   max)))
  (iteration 1 2 n))
(define (fib-rec n)
  (cond ((= n 0) 0)
        ((= n 1) 1)
        (else (+ (fib-rec (- n 1))
                 (fib-rec (- n 2))))))
(define (fib-iter n)
  (define (iteration a b cpt)
    (if (= cpt 0)
        b
        (iteration (+ a b) a (- cpt 1))))
  (iteration 1 0 n))
(define (ways-to-finance a)
  (define (wtf a n)
    (define (kind n)
      (cond ((= n 1) 1)
            ((= n 2) 5)
            ((= n 3) 10)
            ((= n 4) 25)
            ((= n 5) 50)))
    (cond ((= a 0) 1)
          ((< a 0) 0)
          ((= n 0) 0)
          (else (+ (wtf a
                        (- n 1))
                   (wtf (- a
                           (kind n))
                        n)))))
  (wtf a 5))
(define (f n)
  (if (< n 3)
      n
      (+ (f (- n 1))
         (f (- n 2))
         (f (- n 3)))))
(define (exp-rec e n)
  (if (= 0 n)
      1
      (* e
         (exp-rec e (- n 1)))))
(define (exp-iter e n)
  (define (iteration e value cpt max)
    (if (> cpt max)
        value
        (iteration e
                   (* e value)
                   (+ cpt 1)
                   max)))
  (iteration e 1 1 n))
(define (sum-interval a b)
  (if (> a b)
      0
      (+ a
         (sum-interval (+ a 1)
                       b))))
(define (cube a) (* a a a))
(define (sum-cube a b)
  (if (> a b)
      0
      (+ (cube a)
         (sum-cube (+ a 1)
                   b))))
(define (sum-fraction a b)
  (if (> a b)
      0
      (+ (/ 1
            (* a
               (+ a 2)))
         (sum-fraction (+ a 4)
                       b))))
(define (sum a b step procedure)
  (if (> a b)
      0
      (+ (procedure a)
         (sum (ope step a)
              b
              ope
              step
              procedure))))
(define (square x) (* x x))
(define (factoriel a b step f)
  (if (> a b)
      1
      (* (f a)
         (factoriel (step a)
                      b
                      step
                      f))))
(define (classique-fact a b)
  (factoriel a
             b
             (lambda (a) (+ a 1))
             (lambda (a) a)))
(define (sqrt-fact a b)
  (factoriel a
             b
             (lambda (a) (* a 1.1))
             sqrt))
(define plus2 (lambda (x) (+ x 2)))
(define (polynome2 a b c)
  (let ((delta (- (square b)
                  (* 4 a c))))
   (cond ((> delta 0)
             (display (/ (- (- b)
                  (sqrt delta))
               (* 2 a)))
             (display " ")
             (display (/ (+ (- b)
                  (sqrt delta))
               (* 2 a))))
         ((= 0 delta)
             (display (/ (- b)
                         (* 2 a))))
         (else display "racines imaginaires"))))