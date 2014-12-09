(ns looping-is-recursion)

(defn power [base exp]
  (if (= exp 0)
    1
    (let [helper (fn [acc n k]
                   (if (= 1 k)
                     acc
                     (recur (* acc n) n (dec k))))]
      (helper base base exp))))

(defn last-element [a-seq]
  (let [[x & xs] a-seq]
      (if (empty? xs)
        x
        (last xs))))

(defn seq= [seq1 seq2]
  ":(")

(defn find-first-index [pred a-seq]
  ":(")

(defn avg [a-seq]
  -1)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])

